/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uach.smp;
import static spark.Spark.*;
/**
 *
 * @author erikzubia
 */
public class Routes {
 
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World");
    }
    
}
