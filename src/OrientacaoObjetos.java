import com.orientacaoobjetos.entity.Professor;

public class OrientacaoObjetos {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.lecionarMateria();
        professor.finalizarTarefa();


        Professor professor2 = new Professor();
        professor2.nome = "Bruno";
        professor2.materia = "Java";
        professor2.escola = "Escola de Java";


        System.out.println(professor);
        System.out.println(professor2);
    }
}