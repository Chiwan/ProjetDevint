import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;


public class Outils {
	
	private BufferedReader br;

	public Outils(){
	
	}
	
	public boolean leMotEstDansLaListe(String mot,String texte){
		String fichier =texte;
		//lecture du fichier texte	
				try{
					InputStream ips=new FileInputStream(fichier); 
					InputStreamReader ipsr=new InputStreamReader(ips);
					br = new BufferedReader(ipsr);
					String ligne;
					String word = mot.toUpperCase();
					System.out.println(word);
					while ((ligne=br.readLine())!=null){						
						if(ligne.length()==word.length()){	
							System.out.println(ligne+"  "+ligne.length());
							System.out.println(String.valueOf(ligne.toUpperCase()));
							if( word.compareTo(ligne.toUpperCase())==0){								
								return true;
							}
						}
					}
					br.close(); 
				}		
				catch (Exception e){
					System.out.println(e.toString());
				}
				return false;
	}

}

