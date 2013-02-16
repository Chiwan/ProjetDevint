import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;


public class Outils {
	
	private BufferedReader br;
	private String chaine;

	public Outils(){
	
	}
	
	public void lireFichier(String texte){
		setChaine("");
		String fichier ="texte";
		
		//lecture du fichier texte	
		try{
			InputStream ips=new FileInputStream(fichier); 
			InputStreamReader ipsr=new InputStreamReader(ips);
			BufferedReader br=new BufferedReader(ipsr);
			String ligne;
			while ((ligne=br.readLine())!=null){
				System.out.println(ligne);
				setChaine(getChaine() + (ligne+"\n"));
			}
			br.close(); 
		}		
		catch (Exception e){
			System.out.println(e.toString());
		}
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

	public String getChaine() {
		return chaine;
	}

	public void setChaine(String chaine) {
		this.chaine = chaine;
	}	
}

