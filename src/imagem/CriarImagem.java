package Imagem;
import javax.swing.*;
 import java.awt.*;
 import java.awt.image.*;
import java.io.IOException;
import javax.imageio.ImageIO;
 
 public class CriarImagem {
     public static void main(String[] args) {
         JFrame frm = new JFrame("Teste Imagem");
         JPanel pan = new JPanel();
         CriarImagem crI = new CriarImagem();
         JLabel lbl = new JLabel( crI .draw() );
         pan.add( lbl );
         frm.getContentPane().add( pan );
         frm.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
         frm.pack();
         frm.show();
     }
     
     public static void drawPointer( int coluna,int linha, Graphics g, Color c  ){
         g.setColor(c);
         g.drawOval( 5*coluna, 5*linha, 2, 2);     
     }
     public ImageIcon draw() {
        
    	try {   
                BufferedImage bufi = ImageIO.read( getClass().getResourceAsStream( "3.jpg" ) );
                int width=bufi.getWidth(); 
                int height= bufi.getHeight();
                System.out.println("largura: "+width);
                System.out.println("altura: "+height);
                int tamMax = 200;
                int taxa = 0;
                if( width >= tamMax ){
                    taxa = width/tamMax;                
                   // width-= tamMax;
                   // height-= tamMax;
                }
                System.out.println("l: "+(taxa));
                BufferedImage buffer = new BufferedImage( 1280, 978, BufferedImage.TYPE_INT_RGB );
                Graphics g = buffer.createGraphics();
    		Color c = null;    		
                
                int coluna=0,linha=0;
    		for ( int j = 1; j < height; j+= taxa ) {
                    for ( int i = 1; i < width; i+= taxa ) {
    				c = new Color( bufi.getRGB( i, j ) );
                                drawPointer(coluna,linha,g,c); 
                                coluna++;
    			}    		
                        linha++;
                        coluna = 0;
    		}
                return new ImageIcon( buffer );
    		
    	} catch ( IOException exc ) {    		
    		exc.printStackTrace();    		
    	}
    	 return new ImageIcon(  );
    }
    
     
 } 