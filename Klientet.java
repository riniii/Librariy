import javax.swing.*;
class Klientet
{
   String e_klientit;
   String adr_k;
   int id_nr;
   int[] nr_katalog;
   String katalogjet;
   
  Klientet()
  {
  nr_katalog =new int[6];
  nr_katalog[0]=0;
   nr_katalog[1]=0;
    nr_katalog[2]=0;
  }


   void klient_ri(int nr_klientit)
   {
   
      String s="";
      s=JOptionPane.showInputDialog("Shkruaj emrin e Klientit");
      e_klientit = s;
      s=JOptionPane.showInputDialog("Shkruaj adresen e Klientit");
      adr_k = s;
      id_nr=nr_klientit;
      katalogjet = "";
   }
   
   void shtyp_klientin(int i)
   {
   i=i+1;
      JOptionPane.showMessageDialog(null, "Klienti "+i+"\n"+"Emri i Klientit: "+e_klientit+"\n"+"Adresa: "+adr_k+"\n"+"ID klientit "+id_nr+"\n"+"Numri i katalogjeve: "+katalogjet+"\n");
      
   
   }
   
   void perditso_klietin()
   {
  // nr_katalog = new int[6];
   
   }


}

