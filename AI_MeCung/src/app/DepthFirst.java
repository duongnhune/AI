/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.Vector;



/**
 *
 * @author Hùng Trần
 */
public class DepthFirst {
    private Vector<Integer> path;
    Vector<Integer> a = new Vector<Integer>();
    public boolean searchPath(int[][] maze, int x, int y,Vector<Integer> a){
       
       if(maze[y][x] == 9){
           a.add(x);
           a.add(y);
           return true;
       }
        if(maze[y][x] == 0){
            maze[y][x] = 3;
            int dx = -1;
            int dy = 0;
            if(searchPath(maze, x+dx, y+dy,a)){
                a.add(x);
                a.add(y);
                return true;
            }
            dx = 1;
            dy = 0;
            if(searchPath(maze, x+dx, y+dy,a)){
                a.add(x);
                a.add(y);
                return true;
            }
            dx = 0;
            dy = -1;
            if(searchPath(maze, x+dx, y+dy,a)){
                a.add(x);
                a.add(y);
                return true;
            }
            dx = 0;
            dy = 1;
            if(searchPath(maze, x+dx, y+dy,a)){
                a.add(x);
                a.add(y);
                return true;
            }
        }
        return false;
    }
    public DepthFirst(int[][] maze, int x, int y){
        searchPath(maze,x, y,a);
        setPath(a);
    }

    /**
     * @return the path
     */
    public Vector<Integer> getPath() {
        return path;
    }

    /**
     * @param path the path to set
     */
    public void setPath(Vector<Integer> path) {
        this.path = path;
    }
}