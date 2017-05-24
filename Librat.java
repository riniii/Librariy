import javax.swing.*;
import java.util.*;
import java.text.*;

public class Librat
{
   String e_libres;
   String author;
   int id_katalog;
   int id_person;
   String data;
   int nr_huazimeve;
GregorianCalendar data1=new GregorianCalendar();
   void liber_ri(int nr_librave)
   {
   
      String s="";
      s=JOptionPane.showInputDialog("Shkruaj emrin e Librit");
      e_libres = s;
   
      s=JOptionPane.showInputDialog("Shkruaj emrin e Autorit");
      author = s;
   
      id_katalog = nr_librave;
      data="";
      nr_huazimeve = 0;
   
   }

   void shtyp_librat(int i)
   {
   i=i+1;
      JOptionPane.showMessageDialog(null, "Libri "+i+"\n"+"Emri: "+e_libres+"\n"+"Autori: "+author+"\n"+"Id "+id_katalog+"\n"+"ID personit "+id_person+"\n"+"Data e kthimit: "+data+"\n"+"Nr huazimeve: "+nr_huazimeve+"\n");
      
   
   }
   
   void perditso_librin(int id_p)
   {
   id_person = id_p;
   nr_huazimeve +=1;
   
   DateFormat df = new SimpleDateFormat("dd/MM/yyyy");  
   
   data1.getTime();
   data1.add(data1.DATE, 14);
   String data2=df.format(data1.getTime());
   data = data2;
   
   }

}

