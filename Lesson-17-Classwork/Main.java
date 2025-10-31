class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

    print(swapLetter("the seen","e","%"));
    
    print(encryption2("abcdefghi"));
    print(encryption2("abcdefgh") );

    print(encryption3("abcdef"));
    print(encryption3("abcde"));
    
  }

  //will use reverse for problem 3
  String reverse(String s){
    String bld="";
    for(int x=s.length()-1; x>=0; x--)
      bld+=s.substring(x,x+1);

    return bld;
  }


  String swapLetter(String s, String find, String replace){
    String bld = "";
    
    for(int x=0;x<=s.length()-1;x++){
      if(s.substring(x,x+1).equals(find))
        bld+=replace;
      else
        bld+=s.substring(x,x+1);
    }
    return bld;
  }

  String encryption2(String s){
    String bld="";
    String first = s.substring(0,s.length()/2);
    String second = s.substring(s.length()/2);

    for(int x=0; x<=first.length()-1;x++)
      bld+=first.substring(x,x+1) +second.substring(x,x+1);
      
    //if string is odd length we have to add the last 
    //letter of second string
    if(s.length()%2==1)
      bld+= second.substring(second.length()-1);
    return bld;
  }

  String encryption3(String s){
    String bld="";
    int len=s.length();
    String fHalf = s.substring(0,len/2);
    String sHalf = s.substring(len/2);
    sHalf = reverse(sHalf);

    for(int x=0; x<=fHalf.length()-1;x++){
      bld+=fHalf.substring(x,x+1);
      bld+=sHalf.substring(x,x+1);
    }
    //If we have odd number of characters add the last 
    // character of the sHalf to the end of bld string
    if(len%2==1)
      bld+=sHalf.substring(sHalf.length()-1);
    return bld;
  }