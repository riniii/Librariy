import javax.swing.*;
import java.util.*;
import java.text.*;


public class KlasaMain{
   public static void main(String[] args){
   GregorianCalendar data1=new GregorianCalendar();
      int i=0, id_b=0, id_b_k=0; boolean ex1=false, ex2=false;
      int nr_librave = 0, nr_aktual_l=0;
      int nr_klientit = 0, nr_aktual_k=0;
   int s; String  e_librit,  e_autorit, e_klient;
   
      Librat[] libri = new Librat[7];
      Klientet[] klienti = new Klientet[7];
   //  boolean perseritja = false;
      while (true)
      {
         s=new Integer(JOptionPane.showInputDialog("Per te regjistruar liber shytp 1 \nPerte regjistruar  klient shtyp 2\nShfaq librat 3\nShfaq klientet 4\nHuazo liber 5")).intValue();
         if (s==1)
         {
            libri[nr_librave] = new Librat();
            libri[nr_librave].liber_ri(nr_librave);
            nr_librave = nr_librave + 1;
         
         }
         else if (s==2)
         {
            klienti[nr_klientit] = new Klientet();
            klienti[nr_klientit].klient_ri(nr_klientit);
            nr_klientit = nr_klientit + 1;
         
         }
         else if (s==3)
         {
         i=0;
         nr_aktual_l=nr_librave;
            while (nr_aktual_l>0)
            {
               libri[i].shtyp_librat(i);
               i+=1;
               nr_aktual_l-=1;
            }
            
         }
         else if (s==4)
         {
         i=0;
         nr_aktual_k=nr_klientit;
            while (nr_aktual_k>0)
            {
               klienti[i].shtyp_klientin(i);
               i+=1;
               nr_aktual_k-=1;
            }
            
         }
         else if (s==5)
         {
             e_librit=JOptionPane.showInputDialog("Shkruaj emrin e librit te  huazuar");
             e_autorit=JOptionPane.showInputDialog("Shkruaj autorin e librit te  huazuar");
             e_klient=JOptionPane.showInputDialog("Shkruaj klientin");
             i=0; nr_aktual_l=nr_librave;
             while (nr_aktual_l>0)
             {
             if ((libri[i].e_libres.equals(e_librit)) && (libri[i].author.equals(e_autorit)) )
             {
             ex1=true;
             id_b = i;
             }
                
             
             i+=1;
             nr_aktual_l-=1;
             }
             
             i=0; nr_aktual_k=nr_klientit;
             while (nr_aktual_k>0)
             {
             if (klienti[i].e_klientit.equals(e_klient)) 
             {
             ex2=true;
             id_b_k = i;
             }
                
             
             i+=1;
             nr_aktual_k-=1;
             }

             if ((ex1==true) && (ex2=true))
             {
             libri[id_b].perditso_librin(klienti[id_b_k].id_nr);
             klienti[id_b_k].katalogjet = klienti[id_b_k].katalogjet + " "+libri[id_b].id_katalog;
             
             }
             else if (ex1==false)
             {
             JOptionPane.showMessageDialog(null, "Libri nuk ekziston!");
             }
             else if (ex2==false)
             {
             JOptionPane.showMessageDialog(null, "Klienti nuk ekziston!");
             }
             }
           

             
             
                    
        


      }
   
   }
}