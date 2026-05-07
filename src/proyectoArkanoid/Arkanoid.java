package proyectoArkanoid;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Arkanoid {

	private static final int FPS = 60;
	public static List<Objetos> lista = null;
	public static MiCanvas canvas = null;
	static Nave jugador = null;
	static Pelota pelota = null;
	public static List<Explosion> explosiones = null;
	public static List<Pelota> pelotas = null;
	private JFrame ventana = null;
	
	private static Arkanoid instance = null;

    public static Arkanoid getInstance() {
        if (instance == null) {
            instance = new Arkanoid();
        }
        return instance;
    }
	
	
	public Arkanoid() {
		// Creas los objetos que van a verse en pantalla
		lista = crearObjetos();
				
		// Creas el canvas
		canvas = new MiCanvas(lista);
		
		// En el constructor de la clase Arkanoid se crea la ventana
		ventana = new JFrame("Arkanoid");
		
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
		
		ventana.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		ventana.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				cerrarAplicacion();
			}
		});
	}
	
	
	public static void main(String[] args) {
		
		Arkanoid.getInstance().juego();
		
	}

	/**
	 * Juego es donde se repinta toda la escena con los cambios
	 */
	public void juego() {
		int millisPorCadaFrame = 1000 / FPS;
		do {
			long millisAntesDeProcesarEscena = new Date().getTime();
			
			canvas.pintaEscena();
			
			for (Objetos o : lista) {
				o.actua();
			}
			
			actuarPelotas(pelotas);

			comprobarPelotas(pelotas);
			//comprobarLadrillos(lista);
			
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
		lista = new ArrayList<Objetos>();
		explosiones = new ArrayList<Explosion>();
		pelotas = new ArrayList<Pelota>();
		
		lista.add(jugador = new Nave(200, 650, 20, 60));
		pelotas.add(pelota = new Pelota(jugador.getX(), jugador.getY(), 15, 15));
		
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
	
	/**
	 * 
	 * @param pelotas
	 */
	public static void comprobarPelotas(List<Pelota> pelotas) {
		boolean hayPelotas = false;
		
		for (Pelota p : pelotas) {
			if (p.isTerminado()) {
				hayPelotas = false;
				break;
			}
			else {
				hayPelotas = true;
			}
		}
		if (!hayPelotas) {
			System.exit(0);
		}
	}
	
	
	public static void comprobarLadrillos(List<Objetos> lista) {
		for (Objetos o : lista) {
			Ladrillo l = (Ladrillo) o;
			System.out.println(l.getDestruido()); 
		}
	}
	
	/**
	 * 
	 * @param Explosiones
	 * @param g
	 */
	public static void explosiones(List<Explosion> explosiones, Graphics2D g) {
		for (Explosion e : explosiones) {
			e.paint(g);
		}
	}
	
	/**
	 * 
	 * @param pelotas
	 * @param g
	 */
	public static void pintarPelotas(List<Pelota> pelotas, Graphics2D g) {
		for (Pelota p : pelotas) {
			p.paint(g);
		}
	}
	
	/**
	 * 
	 * @param pelotas
	 */
	public static void actuarPelotas(List<Pelota> pelotas) {
		for (Pelota p : pelotas) {
			p.actua();
		}
	}
	
	/**
	 * 
	 */
	private void cerrarAplicacion() {
		String [] opciones ={"Aceptar","Cancelar"};
		int eleccion = JOptionPane.showOptionDialog(ventana,"¿Desea cerrar la aplicación?","Salir de la aplicación",
		JOptionPane.YES_NO_OPTION,
		JOptionPane.QUESTION_MESSAGE, null, opciones, "Aceptar");
		if (eleccion == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}
}
