/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author luigg
 */
public class testaRelatorio {
    public static void main  (String[] args){
     
      Relatorio relatorio = new Relatorio();

      HTML h = new HTML();
      h.emitirEm(relatorio);

      System.out.println(relatorio.toString());
      
      PDF p = new PDF();
      p.emitirEm(relatorio);

      System.out.println(relatorio.toString());
      
      XML xm = new XML();
      xm.emitirEm(relatorio);

      System.out.println(relatorio.toString());
      
      XLS xl = new XLS();
      xl.emitirEm(relatorio);

      System.out.println(relatorio.toString());

        
    }
}
