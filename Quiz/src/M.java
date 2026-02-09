class M
{ private int x=5;
void set(int x)
{ x=x; }
int get(){return x;}
public static void main(String[] args)
{ M a=new M();
a.set(20);
System.out.print(a.get());
}
}