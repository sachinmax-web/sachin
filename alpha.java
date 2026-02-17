class sample
{
    public static void main(String []args){
    Scanner scan =new Scanner(System.in);
    char ch=scan.next().charAt(0);
    System.out.printf("enter the character:");
        
        if ch>='a'&&ch<='z'||ch>='A'&&'Z'
            System.out.printf("Alphabet");
        else
            System.out.printf("NOt Alphabet");
        }

    }


