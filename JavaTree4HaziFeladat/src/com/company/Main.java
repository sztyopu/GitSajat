package com.company;

import com.company.data.Tree;
import com.company.repositories.TreeRepository;

public class Main {

    public static void main(String[] args) {
	// write your code here

        TreeRepository treeRepository = new TreeRepository();

        Tree firstTree = new Tree();
        firstTree.setId(1L);
        firstTree.setName("Tölgyi");
        firstTree.setType("Tölgyfa");
        firstTree.setYear(1);


        Tree secondTree = new Tree();
        secondTree.setId(2L);
        secondTree.setName("Szőri");
        secondTree.setType("Barack fa");
        secondTree.setYear(5);

        Tree thirdTree = new Tree();
        thirdTree.setId(3L);
        thirdTree.setName("Szomi");
        thirdTree.setType("Szomorúfűz fa");
        thirdTree.setYear(30);


        treeRepository.add(firstTree);
        treeRepository.add(secondTree);
        treeRepository.add(thirdTree);

        treeRepository.printAll();

        System.out.println();
        treeRepository.remove(2L);
        treeRepository.printAll();

        System.out.println();
        treeRepository.printOneTypeById(1L);


        System.out.println();
        treeRepository.printOneTypeById(2L);
    }
}
