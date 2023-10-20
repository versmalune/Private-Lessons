def generateDictionary(x):
	Dictionary = {}
	#Dictionary 사전 초기화
	for i in range(x):
	#x번만큼 반복
		word = str(input("Input word: "))
		description = str(input("Input description: "))
		Dictionary[word] = description
		#Dictionary 사전에 word라는 key에 대해 description이라는 value로 이루어진 entry 추가
	return Dictionary
	#Dictionary 값 return

x = int(input("Input the number of words: "))
#x는 Dictionary에 몇 개의 entry를 생성할 건지 정해 줌
KorDic = generateDictionary(x)
#KorDic 변수에 generateDictionary(x) 함수의 return값 저장
print(KorDic)

def translateDictionary(dic):
	EngDic = {}
	#EngDic이라는 사전 초기화
	for key in dic.keys():
	#dic사전의 모든 key값들에 대하여
		print("Description: ", dic[key])
		#dic사전의 key라는 key값에 대한 value를 출력
		EngWord = input("Input new word: ")
		EngDic[EngWord] = dic[key]	
		#EngDic사전의 EngWord라는 key값의 value값을 dic사전의 key라는 key값에 대한 value값으로 설정
	return EngDic
	#EngDic 값 return

EngDic = translateDictionary(KorDic)
#EngDic 변수에 translateDictionary함수에 KorDic 넘겨준 return값 저장
print(EngDic)

