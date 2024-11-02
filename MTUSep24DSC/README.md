# MTUSep24DSC
# We love finding a hidden gem of Lab 1 within a folder for file handling - Questions to be answered and probably saved in LaurasLabWork Folder 
# I updated the filename string as it was causing errors since my destination was different to yours
# Q1: I was able to display the linked list of names as normal. I also manipuldated the list by iterating through to add or remove names as desired
# Q2: I was able to use the two different sets to display the names after using an iterator. 
#     What was discovered is that the treeset displays the names randomly while the hashset stick to the order they were added in originally.

# Making an attempt with Lab 2 - Java Collections framework
#   Got the absolute path for the hamlet.txt file and updated it in file handling.

# ArrayListDriver - I played around with the arraylist using different names. 
# I tried counting how many names were added into the list as well as finding if my name was present

# LinkedListDemo - I played around with creating my own linked list based off companies offering internships and was able to remove them as if they became unavailable.
# Iterator vs Enhanced For Loop
# "For-each is syntactic sugar for using iterators" - Stack Overflow ("https://stackoverflow.com/questions/18508786/for-each-vs-iterator-which-will-be-the-better-option")
# Syntactic sugar supposedly is easier to read and write thus making your code that much "Sweeter"
# Iterators are a good choice if you wish to modify what is currently in the List as trying to do so within a for loop would cause an error(attempted with my code)

# MapDemo - I tried using the Color.PURPLE instead of magenta, but that only gave me errors
# After searching a few sites like "https://www.geeksforgeeks.org/java-awt-color-class/" 
# I wondered if I could possibly set PURPLE with its RBG code and call that variable since its defined as a color
# Another big shock, it did not work... but I was still able to call the variable to see a different color code.
# Fun idea was to display the favourite color as the text but that involves learning ANSI Escape Codes to display the text as the color in the console(future endeavour)

# SetDemo - I played around the set using my own name as the new item added in after a duplicate
# First idea is wondering if it would still appear after the duplicate was skipped over, which it did.
# I saw it searched and found my name present in the list.
# I then tried to remove my name from the set names and find what the change would be, the number of elements decreased as well as my name now could not be found.
# Something strange occurred that Romeo although added in the start it was displayed at the end
# Then when I tried adding John in above romeo, with the hypothesis that it would be displayed at the end, I was proven wrong.
# John was displayed on top of Romeo and it's confusing.
# Fun Update:  "in particular, it does not guarantee that the order will remain constant over time." A hash set does not guarantee order - "https://stackoverflow.com/questions/9345651/ordering-of-elements-in-java-hashset"