/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package imagem;

import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

public class CarregaImagem {

    public static void main( String[] args ) {
    	
    	new CarregaImagem().carregar();
    	
    }
    
    public void carregar() {
    	
    	try {
    		
    		BufferedImage bufi = ImageIO.read( getClass().getResourceAsStream( "1.jpg" ) );
    		
    		Color c = null;
    		
    		for ( int i = 0; i < bufi.getHeight(); i++ ) {
    			for ( int j = 0; j < bufi.getWidth(); j++ ) {
    				c = new Color( bufi.getRGB( i, j ) );
    				System.out.println(c.getBlue() );
    			}
    			System.out.println();
    		}
    		
    	} catch ( IOException exc ) {
    		
    		exc.printStackTrace();
    		
    	}
    	
    }
    public void draw() {
    	
    	try {    		
    		BufferedImage bufi = ImageIO.read( getClass().getResourceAsStream( "1.jpg" ) );    		
    		Color c = null;    		
    		for ( int i = 0; i < bufi.getHeight(); i++ ) {
    			for ( int j = 0; j < bufi.getWidth(); j++ ) {
    				c = new Color( bufi.getRGB( i, j ) );
    				System.out.println(c.getBlue() );
    			}
    			System.out.println();
    		}
    		
    	} catch ( IOException exc ) {    		
    		exc.printStackTrace();    		
    	}
    	
    }
        
}