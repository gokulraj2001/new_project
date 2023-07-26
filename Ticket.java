class Ticket
{
int count=1;
synchronized  int count()
{
return count++;
}
}

class TicketMachine extends Thread
{
Ticket t=new Ticket();
public void run()
 {
   for(int i=0;i<=10;i++)
    {
	int s=t.count();
    System.out.println(" Ticket Count"+s);
    }
}
}

class Scheduler extends Thread
{
Ticket t=new Ticket();
public void run() 
{
try{
   for(int i=0;i<=10;i++)
    {
  Thread.sleep(1000);
    System.out.println(" Schedule count"+t.count());
    }
}
catch(Exception e) {}

}
public void next()
{
t.count();
}

}
class demoticket
{
public static void  main(String args[]) throws Exception
{
TicketMachine tm=new TicketMachine();
Scheduler s=new Scheduler ();

 
	tm.start();
	s.start();
    
//s.next();

}
}
