package Java_Collections_Framework.Bloco3.Q12;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Com Stream

public class Main {

    public static void main(String[] args) {

        List<Aluno> alunos = new ArrayList<>();

        alunos.add(new Aluno("Ana", "Sistemas"));
        alunos.add(new Aluno("Bruno", "Sistemas"));
        alunos.add(new Aluno("Carlos", "Agronomia"));
        alunos.add(new Aluno("Daniel", "Agronomia"));
        alunos.add(new Aluno("Eduardo", "Direito"));

        Map<String, List<Aluno>> cursos =
                alunos.stream()
                        .collect(Collectors.groupingBy(Aluno::getCurso));

        System.out.println(cursos);
    }
}

//Sem Stream
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        List<Aluno> alunos = new ArrayList<>();
//
//        alunos.add(new Aluno("Ana", "Sistemas"));
//        alunos.add(new Aluno("Bruno", "Sistemas"));
//        alunos.add(new Aluno("Carlos", "Agronomia"));
//        alunos.add(new Aluno("Daniel", "Agronomia"));
//        alunos.add(new Aluno("Eduardo", "Direito"));
//
//        Map<String, List<Aluno>> cursos = new HashMap<>();
//
//        for (Aluno aluno : alunos) {
//
//            String curso = aluno.getCurso();
//
//            if (!cursos.containsKey(curso)) {
//                cursos.put(curso, new ArrayList<>());
//            }
//
//            cursos.get(curso).add(aluno);
//        }
//
//        for (String curso : cursos.keySet()) {
//
//            System.out.println("Curso: " + curso);
//
//            for (Aluno aluno : cursos.get(curso)) {
//                System.out.println(" - " + aluno.getNome());
//            }
//
//            System.out.println();
//        }
//    }
//}