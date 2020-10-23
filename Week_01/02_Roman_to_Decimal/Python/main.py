def roman_to_decimal(roman : str) -> int:
    conversion_table = {'M' : 1000, 'D' : 500, 'C' : 100, 'L' : 50, 'X' : 10, 'V' : 5, 'I' : 1}
    previous, output = conversion_table[roman[0]], conversion_table[roman[0]]
    i = 1

    while i < len(roman):
        if previous > conversion_table[roman[i]] and i + 1 < len(roman) and conversion_table[roman[i]] < conversion_table[roman[i + 1]]:
                previous = conversion_table[roman[i + 1]] - conversion_table[roman[i]]
                i += 1
        else:
            previous = conversion_table[roman[i]]

        output += previous
        i += 1

    return output

print(roman_to_decimal("MMMCMXCIX"))
