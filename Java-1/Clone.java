class Clone implements Cloneable
{
    int rollno;
    String name;
    
    Clone(int rollno,String name)
    {
        this.rollno=rollno;
        this.name=name;
    }
    
    public Object clone()throws CloneNotSupportedExceptio
    {
        return super.clone();
    }
    
    public static void main(String args[])
    {
        try
        {
            Clone s1=new Clone(101,"amit");
            
            Clone s2=(Clone)s1.clone();
            
            System.out.println(s1.rollno+" "+s1.name);
            System.out.println(s2.rollno+" "+s2.name);  
            
        }
        catch(CloneNotSupportedException c)
        {}
        
    }  
}
