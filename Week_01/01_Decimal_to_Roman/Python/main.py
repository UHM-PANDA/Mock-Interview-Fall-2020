def decimal_to_roman(decimal: int) -> str:
    output = ""
    roman_numerals = ['M', 'CM', 'D', 'CD', 'C', 'XC', 'L', 'XL', 'X', 'IX', 'V', 'IV', 'I']
    conversion = [1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1]
    for i in range(len(roman_numerals)):
        while decimal >= conversion[i]:
            output += roman_numerals[i]
            decimal -= conversion[i]

    return output

print(decimal_to_roman(3999))
