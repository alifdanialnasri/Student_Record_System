package com.nycto;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Objects;
import java.util.Scanner;

public class Main {



//main method
    public static void main(String[] args) {

        //array declaration
        ArrayList<Student> Studentlist = new ArrayList<>();

        //student object initialization
        Student student1 = new Student("S001","Maryam");
        Student student2 = new Student("S002","Kelvin");
        Student student3 = new Student("S003","Yahya");

        //course object declareation
        Course course1 = new Course("Java Programming","1500");
        Course course2 = new Course("Object-Oriented Design","1500");
        Course course3 = new Course("Softwarew","1500");

        //add student into arraylist
        Studentlist.add(student1);
        Studentlist.add(student2);
        Studentlist.add(student3);
        Scanner userinput = new Scanner(System.in);

        //variable declaration
        String menuopt ;
        String caseaopt ;
        String duit;


        //do while loop
        do {
            //main menu message
            System.out.println("===============================\n" +
                    "Main Menu\n"+"!!USE UPPERCASE ONLY!!\n"+"===============================\n\n"+"A).Student Admin\nB).Update Tuition Fees\nC).Exit\n");
            menuopt = userinput.next();


            //main menu switch
            switch(menuopt)
            {

                //Amin case
                case "A":
                {
                    do
                    {
                        //admin menu
                        System.out.println("======================================\n" +
                                "The Real Training Center - Student Admin\n"+"!!USE LOWECASE ONLY!!\n"+"======================================\n\n"+"a).List all student\nb).Add a new student\nc).Go Back\n");
                        caseaopt = userinput.next();

                        //admin menu switch
                        switch(caseaopt)
                        {
                            //view student case
                            case "a":
                            {
                                //view student calling method
                                  viewStud(Studentlist);
                                  break;
                            }

                            //add student case
                            case "b":
                            {
                                String id;

                                //exception
                                try {

                                        //for loop
                                        for(Student baru : Studentlist)
                                        {
                                            //ask user to input id
                                            System.out.println("Enter ID");
                                            Scanner userid = new Scanner(System.in);
                                            id = userid.nextLine();

                                            //if-else statement
                                            if(Objects.equals(id, baru.getStudentid()))
                                            {
                                                //true
                                                //id already exist message
                                                System.out.println("This User is Already Exist");
                                            }
                                            else
                                            {
                                                //ask user to input name
                                                System.out.println("Enter Name");
                                                Scanner addname = new Scanner(System.in);
                                                String name = (addname.nextLine());


                                                //add student into arraylist
                                                int i = 3;
                                                Studentlist.add(i, new Student(id, name));
                                                ++i;



                                            }
                                        }








                                }
                                //exception statement
                                catch(ConcurrentModificationException e)
                                {
                                    System.err.println();
                                }
                                break;



                            }

                            //return to main menu case
                            case "c" :
                            {
                                System.out.println("Return To Main Menu");
                                break;

                            }

                            //default case
                            default:
                            {
                                System.out.println("!PLEASE USE LOWECASECASE ONLY!");
                            }
                        }

                    }while(!caseaopt.equals("c"));

                    break;
                }

                //main menu case
                //fee case
                case "B":
                {
                    do
                    {
                        //course fee main menu
                        System.out.println("====================================================================\n" +
                                "The Real Training Center – Student Admin\n" +"!!USE LOWERCASE ONLY\n"+
                                "====================================================================" +
                                "\nPlease Select The Course: " +
                                "\na. Java Programming "
                                + "\nb. Object-oriented Design "
                                + "\nc. Software Testing "
                                + "\nd. Go back");

                        //scanner
                        Scanner cd = new Scanner(System.in);
                         duit = cd.nextLine();

                        //fee menu switch
                        switch (duit) {
                            case "a":
                            {
                                System.out.println("Please enter the new fee for Java Programming or enter “c” to cancel.\n");

                                Scanner j = new Scanner(System.in);
                                String fee = j.next();

                                if(fee.equalsIgnoreCase("c"))
                                {
                                    System.out.println("You Have Cancel to update price");
                                }
                                else
                                {
                                    course1.setCourseprice(fee);
                                    System.out.println("Fee Update Successfully " + course1.getCourseprice());
                                    System.out.println("\n1." + course1.getCoursename() + "-Rm " + course1.getCourseprice()
                                            + "\n2." + course2.getCoursename() + "-RM " + course2.getCourseprice()
                                            + "\n3." + course3.getCoursename() + "-RM " + course3.getCourseprice());
                                }
                                break;

                            }


                            case "b":
                            {
                                System.out.println("Please enter the new fee for Object-Oriented Design or enter “c” to cancel.\n");
                                Scanner o = new Scanner(System.in);
                                String fee1 = o.next();

                                if(fee1.equalsIgnoreCase("c"))
                                {
                                    System.out.println("You Have Cancel to update price");
                                }
                                else
                                {
                                    course2.setCourseprice(fee1);
                                    System.out.println("Fee Update Successfully " + course2.getCourseprice());
                                    System.out.println("\n1." + course1.getCoursename() + "-Rm " + course1.getCourseprice()
                                            + "\n2." + course2.getCoursename() + "-RM " + course2.getCourseprice()
                                            + "\n3." + course3.getCoursename() + "-RM " + course3.getCourseprice());
                                }
                                break;
                            }








                            case "c":
                            {
                                System.out.println("\"Please enter the new fee for Software Testing or enter “c” to cancel.");
                                Scanner s = new Scanner(System.in);
                                String fee2 = s.next();

                                if(fee2.equalsIgnoreCase("c"))
                                {
                                    System.out.println("You Have Cancel to update price");
                                }
                                else
                                {
                                    course3.setCourseprice(fee2);
                                    System.out.println("Fee Update Successfully " + course3.getCourseprice());
                                    System.out.println("\n1." + course1.getCoursename() + "-Rm " + course1.getCourseprice()
                                            + "\n2." + course2.getCoursename() + "-RM " + course2.getCourseprice()
                                            + "\n3." + course3.getCoursename() + "-RM " + course3.getCourseprice());
                                }
                                break;
                            }

                            case "d":
                            {
                                System.out.println("Return To Main Menu");
                                break;
                            }

                            default:
                            {
                                System.out.println("!!USE LOWERCASE ONLY");
                            }
                        }



                    }while(!duit.equals("d"));


                    break;
                }

                //exit casee
                case "C":
                {
                    System.out.println("Bye-Bye");
                    break;

                }

                //default case
                default:
                {
                    System.out.println("!PLEASE USE UPPERCASE ONLY!");
                }
            }

        }while(!menuopt.equals("C"));



//end of main method
    }

    //view student method
    public static void viewStud(ArrayList<Student> stud) {

        //for loop
        //get data from array
        for (Student element : stud) {
            if (null != element) {
                System.out.println("Student ID: " + element.getStudentid()+"\n"+"Student Name: " + element.getStudentname()+"\n");


            }

        }
        System.out.println("There are "+stud.size()+" students in total");
        //end of view student method
    }

//end of main class
}
