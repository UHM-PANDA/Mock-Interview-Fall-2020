# Time-Optimal: O(n) time, O(n) space
def sockMerchantTime(arr):
  hashTable = {}
  for i in arr:
    if not i in hashTable:
      hashTable[i] = 1
    else:
      hashTable[i] += 1
  pairs = 0
  for i, elem in hashTable.items():
    pairs += elem//2
  return pairs

# Space-Optimal: O(nlgn) time, O(1) space
def sockMerchantSpace(arr):
  arr.sort()
  currentVal = arr[0]
  currentCount = 0
  pairCount = 0
  for i in arr:
    if i == currentVal:
      currentCount += 1
    else:
      pairCount += currentCount//2
      currentVal = i
      currentCount = 1
  pairCount += currentCount//2
  return pairCount
  
# Testing
arr = [4,1,4,1,3,3,3,5,6,5]
print(sockMerchantTime(arr))
print(sockMerchantSpace(arr))