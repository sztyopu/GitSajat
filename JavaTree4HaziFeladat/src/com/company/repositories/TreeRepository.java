package com.company.repositories;

//import sun.reflect.generics.tree.Tree;
import com.company.data.Tree;
import jdk.nashorn.internal.ir.IfNode;

import java.util.ArrayList;

public class TreeRepository {

    private ArrayList<Tree> fak = new ArrayList<>();

    public TreeRepository(){
        //Ures konstruktor
    }

    // Hozza adunk egy Fát!
    public void add(Tree treeTipusuElem){fak.add(treeTipusuElem);}

    //Kiiratas
    public void printAll(){
        for (Tree tree : fak){
            System.out.print("Azonosító: " + tree.getId()+ ", ");
            System.out.print("Név: " + tree.getName()+ ", ");
            System.out.print("Típus: " + tree.getType()+ ", ");
            System.out.print("Év: " + tree.getYear()+ ", ");
            System.out.println();

        }



    }

    //Delete
    public void remove(Long id){
        for (Tree tree : fak){
            if (tree.getId().equals(id)){
                fak.remove(tree);
            }
        }
    }


    //Megmondja a tipusat id alapjan
    public void printOneTypeById(Long id){
        boolean vanIlyenId = false;
        for (Tree tree : fak){
            if (tree.getId().equals(id)){
                System.out.println("Típus: "+tree.getType());
                vanIlyenId = true;
                break;
            }
        }
        if (!vanIlyenId){System.out.println("Nincs ilyen azonosítójú elem");}
    }

}
