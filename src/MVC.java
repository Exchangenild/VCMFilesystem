import javax.swing.SwingUtilities;
/* 
 * Tutoial MVC:
 * https://javabeginners.de/Design_Patterns/Model-View-Controller.php
 * vier
 *
 *git : 
 *https://stackoverflow.com/questions/17552457/how-do-i-upload-eclipse-projects-to-github
 *https://stackoverflow.com/questions/19474186/egit-rejected-non-fast-forward
*/ 
public class MVC { 

    public static void main(String[] args) { 
        SwingUtilities.invokeLater(new Runnable() { 
            public void run() { 
                new MVCView(); 
            } 
        }); 
    }
    
    /*
	// Tutorial: 
	private void notizen(){
		// super: man kann bei trotz abgeleiteter Methode die originale nutzen
		// final: diese methode kann nicht abgeleitet werden
		// abstract: diese methode oder Klasse muss abgeleitet werden
		// static: diese Variable wird einmalig initialisiert
		// static methoden können ohne Klasse existieren (Klassenmethode)
		
		// public: in allen Paketen verfügabr
		// keine Modifizierer: verfügbar innerhalb des eigenen Pakets
		// protected: verfügbar innerhalb des eigenen Pakets und in allen von dieser Klasse abgeleiteten Klassen
		// pivate: verfügbar nur innerhalb der eigenen Klasse
	}
	
	private void arraySchaffen(){
		// fix mit 100 Elementen
		int[] name = new int[100];
		// Liste
		GUI fensterListe[] = new GUI [5];
		// Multidimensional
		double [][] matrix = new double [3][3];
	}
	
	private void druckenAufTerminal(){
		System.out.println("Hallo Welt"+"/n");
	}
	
	private void umwandenlnTypen(){
		// automatisch
		int x = 4711;
		double y;
		y = x;
		
		// explizit (casting)
		int a = 3000;
		int b = 3000;
		short c;
		
		c = (short) (a+b);
	}
    */
    
} 