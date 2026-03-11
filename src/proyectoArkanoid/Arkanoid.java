package proyectoArkanoid;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JFrame;


public class Arkanoid {

	private static final int FPS = 60;
	private static List<Objetos> lista = null;
	public static MiCanvas canvas = null;
	static Nave jugador = null;
	
	
	public Arkanoid() {
		// Creas los objetos que van a verse en pantalla
		lista = crearObjetos();
				
		// Creas el canvas
		canvas = new MiCanvas(lista);
		
		// En el constructor de la clase Arkanoid se crea la ventana
		JFrame ventana = new JFrame("Arkanoid");
		
		ventana.setBounds(0, 0, 600, 800);
		ventana.getContentPane().setLayout(new BorderLayout());
		
		ventana.getContentPane().add(canvas, BorderLayout.CENTER);
		ventana.setIgnoreRepaint(true);
		ventana.setVisible(true);
		
		
		
		canvas.addMouseMotionListener(new MouseAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseMoved(e);
				jugador.moverRaton(e.getX());
			}
		});
		
		canvas.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				super.keyPressed(e);
				jugador.moverTecla(e.getKeyCode());
			}
		});
	}
	
	
	public static void main(String[] args) {
		
		new Arkanoid();
		
		int millisPorCadaFrame = 1000 / FPS;
		do {
			long millisAntesDeProcesarEscena = new Date().getTime();
			
			for (Objetos o : lista) {
				o.actua();
			}
			
			canvas.repaint();
			
			long millisDespuesDeProcesarEscena = new Date().getTime();
			int millisDeProcesamientoDeEscena = (int) (millisDespuesDeProcesarEscena - millisAntesDeProcesarEscena);
			int millisPausa = millisPorCadaFrame - millisDeProcesamientoDeEscena;
			millisPausa = (millisPausa < 0)? 0 : millisPausa;
			
			try {
				Thread.sleep(millisPausa);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		} while (true);
		
		
	}

	
	/**
	 * 
	 * @return
	 */
	public static List<Objetos> crearObjetos() {
		List<Objetos> lista = new ArrayList<Objetos>();
		
		lista.add(jugador = new Nave(200, 650, 20, 60));
		lista.add(new Pelota(200, 600, 15, 15));
		
		int x = 0; int y = 10;
		
		for (int i = 0; i <= 10; i++) {
			
			Color color = null;
			switch (i) {
			case 0, 5, 10:
				color = Color.CYAN;
				break;
			case 1, 6:
				color = Color.RED;
				break;
			case 2, 7:
				color = Color.BLUE;
				break;
			case 3, 8:
				color = Color.GREEN;
				break;
			case 4, 9:
				color = Color.YELLOW;
				break;
			}
			for (int j = 0; j <= 12; j++) {
				lista.add(new Ladrillo(x, y, 20, 40, color));
				x += 45;
			}
			x = 0;
			y += 25;
		}
		
		return lista;
	}
}
