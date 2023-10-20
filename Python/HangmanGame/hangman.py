import random
import string

WORDLIST_FILENAME = "words.txt"

def load_words():
    """Returns a list of valid words. Words are strings of lowercase letters.
    Depending on the size of the word list, this function may
    take a while to finish."""
    print("Loading word list from file...")
    # inFile: file
    inFile = open(WORDLIST_FILENAME, 'r')
    # line: string
    line = inFile.readline()
    # wordlist: list of strings
    wordlist = line.split(" ")
    print(len(wordlist), "words loaded.")
    return wordlist

def chooseWord(wordlist):
    """wordlist (list): list of words (strings)
    Returns a word from wordlist at random"""
    return random.choice(wordlist)

# end of helper code
# -----------------------------------

# actually load the dictionary of words and point to it with 
# the wordlist variable so that it can be accessed from anywhere
# in the program
wordlist = load_words()
# your code begins here!
#------------------------------------
def isWordGuessed(secretWord, lettersGuessed):
    '''secretWord: string, the word the user is guessing
    lettersGuessed: list, what letters have been guessed so far
    returns: boolean, True if all the letters of secretWord are in lettersGuessed;
    False otherwise'''
    for word in secretWord:
        if word not in lettersGuessed:
            return False
    return True

def getGuessedWord(secretWord, lettersGuessed):
    '''secretWord: string, the word the user is guessing
    lettersGuessed: list, what letters have been guessed so far
    returns: string, comprised of letters and underscores that represents
    what letters in secretWord have been guessed so far.'''
    ans = ''
    for letter in secretWord:
        if letter in lettersGuessed:
            ans += letter
        else:
            ans += '_ '
    return ans

def getAvailableLetters(lettersGuessed):
    '''lettersGuessed: list, what letters have been guessed so far
    returns: string, comprised of letters that represents what letters have not
    yet been guessed.'''
    import string
    letterList = list(string.ascii_lowercase)
    outString = ''
    for letter in lettersGuessed:
        if letter in letterList:            
            letterList.remove(letter)
    for char in letterList:
        outString += char
    return outString

def hangman(secretWord):
    import string
    initialString = string.ascii_lowercase
    print('Welcome to the game, Hangman!')
    print('I am thinking of a word that is ' + str(len(secretWord)) + ' letters long.')
    getLetter = ''
    num = 8
    guessedLetters = ''

    while num > 0:
        print('-----------')
        if isWordGuessed(secretWord, getLetter):
            print('Congratulations, you won!')
            break
        print('You have ' + str(num) + ' guesses left.')
        print('Available letters: ' + getAvailableLetters(getLetter))

        char = input('Please guess a letter: ')
        loChar = char.lower()
        getLetter += loChar
        outString = getGuessedWord(secretWord, getLetter)

        # if the letters are guessed
        if loChar in secretWord:
            if loChar in guessedLetters: # output to remind repeat input
                print('Oops! You have already guessed that letter: ' + outString)           
            else:
                print('Good guess: ' + outString)

        # if the letters are not guessed   
        else:
            if loChar in guessedLetters:
                print('Oops! You have already guessed that letter: ' + outString)
            else:
                print('Oops! That letter is not in my word: ' + outString)
                num -= 1
              
        guessedLetters += loChar
    if num == 0:
        print('-----------')
        print('Sorry, you ran out of guesses. The word was ' + secretWord + '.')

secretWord = chooseWord(wordlist).lower()
hangman(secretWord)  
