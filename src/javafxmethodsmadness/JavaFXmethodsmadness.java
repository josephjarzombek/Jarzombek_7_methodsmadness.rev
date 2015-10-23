/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxmethodsmadness;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author josephjarzombek
 */
public class JavaFXmethodsmadness extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        
  
        primaryStage.setTitle("Drawing Operations Test");
        Group root = new Group();
        Canvas canvas = new Canvas(1580, 1580);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        primaryStage.show();
        primaryStage.setScene(new Scene(root));
        for (int x=0;x<1580;x++){
            for (int y=109;y<782;y++){
           if(y%125==0&x%125==0){   
              drawStarthree(gc, x, y);
      drawStarfour(gc, x, y);
              

                
          if(y%125==0&x%250==0){
      
       drawStar(gc, x, y);
               drawStartwo(gc, x, y);
        }
        }
        }
        }
         for (int x2=0;x2<1580;x2++){
            for (int y2=109;y2<782;y2++){
           if(y2%250==0&x2%250==0){   
               drawStarfive(gc, x2, y2);
               drawStarsix(gc, x2, y2);
           }   
        }  
         }
        root.getChildren().add(canvas);
    
        }
    
   private void drawStar(GraphicsContext gc, int x, int y) {
       gc.setFill(Color.BLUE);
       gc.fillPolygon(new double[]{x+150, x+135, x+150, x+165, },
               new double[]{y, y+40, y+68.09, y+40, },4);
       gc.fillPolygon(new double[]{x+135, x+98, x+124.4663, x+150, },
               new double[]{y+40, y+40, y+68.09, y+68.09, },4);
       gc.fillPolygon(new double[]{x+124.4663, x+109.4663, x+150, x+150 },  
               new double[]{y+68.09, y+108.09, y+85, y+68.09, },4); 
       gc.fillPolygon(new double[]{x+150, x+190.5337, x+175.5337, x+150, },
               new double[]{y+85, y+108.09, y+68.09, y+68.09,},4);
       gc.fillPolygon(new double[]{x+175.5337, x+202, x+165, x+150,},
               new double[]{y+68.09, y+40, y+40, y+68.09,},4);
   } 
   private void drawStarthree(GraphicsContext gc, int x, int y) {
       gc.setFill(Color.RED);
       gc.fillPolygon(new double[]{x+150, x+135, x+150, x+165, },
               new double[]{y, y+40, y+68.09, y+40, },4);
       gc.fillPolygon(new double[]{x+135, x+98, x+124.4663, x+150, },
               new double[]{y+40, y+40, y+68.09, y+68.09, },4);
       gc.fillPolygon(new double[]{x+124.4663, x+109.4663, x+150, x+150 },  
               new double[]{y+68.09, y+108.09, y+85, y+68.09, },4); 
       gc.fillPolygon(new double[]{x+150, x+190.5337, x+175.5337, x+150, },
               new double[]{y+85, y+108.09, y+68.09, y+68.09,},4);
       gc.fillPolygon(new double[]{x+175.5337, x+202, x+165, x+150,},
               new double[]{y+68.09, y+40, y+40, y+68.09,},4);
   
   }
   private void drawStartwo(GraphicsContext gc, int x, int y) {
       gc.setStroke(Color.RED);
       gc.setLineWidth(5);
       gc.strokePolygon(new double[]{x+150, x+135, x+150, x+165, },
               new double[]{y, y+40, y+68.09, y+40, },4);
       gc.strokePolygon(new double[]{x+135, x+98, x+124.4663, x+150, },
               new double[]{y+40, y+40, y+68.09, y+68.09, },4);
       gc.strokePolygon(new double[]{x+124.4663, x+109.4663, x+150, x+150 },  
               new double[]{y+68.09, y+108.09, y+85, y+68.09, },4); 
       gc.strokePolygon(new double[]{x+150, x+190.5337, x+175.5337, x+150, },
               new double[]{y+85, y+108.09, y+68.09, y+68.09,},4);
       gc.strokePolygon(new double[]{x+175.5337, x+202, x+165, x+150,},
               new double[]{y+68.09, y+40, y+40, y+68.09,},4);
   } 
   private void drawStarfour(GraphicsContext gc, int x, int y) {
       gc.setStroke(Color.GOLDENROD);
       gc.setLineWidth(5);
       gc.strokePolygon(new double[]{x+150, x+135, x+150, x+165, },
               new double[]{y, y+40, y+68.09, y+40, },4);
       gc.strokePolygon(new double[]{x+135, x+98, x+124.4663, x+150, },
               new double[]{y+40, y+40, y+68.09, y+68.09, },4);
       gc.strokePolygon(new double[]{x+124.4663, x+109.4663, x+150, x+150 },  
               new double[]{y+68.09, y+108.09, y+85, y+68.09, },4); 
       gc.strokePolygon(new double[]{x+150, x+190.5337, x+175.5337, x+150, },
               new double[]{y+85, y+108.09, y+68.09, y+68.09,},4);
       gc.strokePolygon(new double[]{x+175.5337, x+202, x+165, x+150,},
               new double[]{y+68.09, y+40, y+40, y+68.09,},4);
   } 
   private void drawStarfive(GraphicsContext gc, int x, int y) {
       gc.setFill(Color.WHITESMOKE);
       gc.fillPolygon(new double[]{x+150, x+135, x+150, x+165, },
               new double[]{y, y+40, y+68.09, y+40, },4);
       gc.fillPolygon(new double[]{x+135, x+98, x+124.4663, x+150, },
               new double[]{y+40, y+40, y+68.09, y+68.09, },4);
       gc.fillPolygon(new double[]{x+124.4663, x+109.4663, x+150, x+150 },  
               new double[]{y+68.09, y+108.09, y+85, y+68.09, },4); 
       gc.fillPolygon(new double[]{x+150, x+190.5337, x+175.5337, x+150, },
               new double[]{y+85, y+108.09, y+68.09, y+68.09,},4);
       gc.fillPolygon(new double[]{x+175.5337, x+202, x+165, x+150,},
               new double[]{y+68.09, y+40, y+40, y+68.09,},4);
   
   }
     private void drawStarsix(GraphicsContext gc, int x, int y) {
       gc.setStroke(Color.BLUE);
       gc.setLineWidth(5);
       gc.strokePolygon(new double[]{x+150, x+135, x+150, x+165, },
               new double[]{y, y+40, y+68.09, y+40, },4);
       gc.strokePolygon(new double[]{x+135, x+98, x+124.4663, x+150, },
               new double[]{y+40, y+40, y+68.09, y+68.09, },4);
       gc.strokePolygon(new double[]{x+124.4663, x+109.4663, x+150, x+150 },  
               new double[]{y+68.09, y+108.09, y+85, y+68.09, },4); 
       gc.strokePolygon(new double[]{x+150, x+190.5337, x+175.5337, x+150, },
               new double[]{y+85, y+108.09, y+68.09, y+68.09,},4);
       gc.strokePolygon(new double[]{x+175.5337, x+202, x+165, x+150,},
               new double[]{y+68.09, y+40, y+40, y+68.09,},4);
   }   
}