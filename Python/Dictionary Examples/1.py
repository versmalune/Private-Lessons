def generateDictionary(x):
	Dictionary = {}
	for i in range(x):
		word = str(input("Input word: "))
		description = str(input("Input description: "))
		Dictionary[word] = description
	return Dictionary

x=int(input("Input the number of words: "))

print(generateDictionary(x))
