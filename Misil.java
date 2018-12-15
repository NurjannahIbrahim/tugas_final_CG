/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visualloopp;



import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;

public class Misil extends Lingkaran{
    
    Arah arah = Arah.DEFAULT;//arah gerakan misil

    public Misil(Canvas canvas, float cx, float cy, float radius, float speed, Arah arah, Color color) {
        this.canvas = canvas;
        this.cx = cx;
        this.cy = cy;
        this.speed = speed;
        this.radius = radius;
        this.color = color;
        this.arah = arah;
    }    
    
    public void update(){
        if(arah.equals(Arah.UP)){
            this.moveUp();
        }else if(arah.equals(Arah.DOWN)){
            this.moveDown();
        }
        
    }
    
}
