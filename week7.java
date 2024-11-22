class week7 {
 String wrap(String text, char symbol) {
    if(symbol == '(')
        return "(" + text + ")";
    else if(symbol == '[')
        return "[" + text + "]";
    else if(symbol == '{')
        return "{" + text + "}";
    else
        return symbol + text + symbol;
}

int count(String s, String[] array) {
    int c = 0;
    for(int i = 0; i < array.length; i++)
        if(array[i].equals(s))
           c++;
    return c;
} 
}

