
package cecs220_a3_p6;




public class PriorityMain {

    
    public static void main(String[] args) 
    {
        Task task1 = new Task("Sleep in");
        Task task2 = new Task("Go to school");
        Task task3 = new Task("Play guitar");
        Task task4 = new Task("Call mom");
        
        task1.setPriority(4);
        task2.setPriority(1);
        task3.setPriority(3);
        task4.setPriority(2);
        
        System.out.println("_Task_\t   _Priority Level_");
        System.out.println(task1);
        System.out.println(task2);
        System.out.println(task3);
        System.out.println(task4);
    }
    
    
    
}
