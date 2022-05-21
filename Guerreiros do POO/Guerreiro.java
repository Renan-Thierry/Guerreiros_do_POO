import java.util.Random;

public class Guerreiro {
    private String codigo;
    private String nome;
    private int energia;

public Guerreiro(String codigo, String nome) {
    this.codigo = codigo;
    this.nome = nome;
    this.energia = 5;
}

public void setNome(String nome) {
    this.nome = nome;
}

public void setCodigo(String codigo) {
    this.codigo = codigo;
}

public String getNome() {
    return nome;
}

public String getCodigo() {
    return codigo;
}

public int getEnergia() {
    return energia;
}

private void incremento() {
    if (energia < 5) {
        energia++;
    }
}

private void decremento() {
    if (energia > 0) {
        energia--;
    }else {
        System.out.println("O Guerreiro " + nome + " está sem Energia !");
    }
}

private int atacar() {
    Random dano = new Random();    
    return dano.nextInt(2);
}

public void alimentar_se() {
    incremento();
}

public void alimentar_se_Completamente() {
    if (energia == 5) {
        incremento();
    }else {
        incremento();
        alimentar_se_Completamente();
    }
}

public int lutar(Guerreiro guerreiro) {
    do{
        int dano1 = atacar();    
        if (dano1 == 1) {
            guerreiro.decremento();
        }
            
        if (guerreiro.energia > 0) {
            int dano2 = guerreiro.atacar();
        if (dano2 == 1) {
            decremento();
        }
        }
    } while ((energia > 0) && (guerreiro.energia > 0));
        if (energia == 0) {
            decremento(); 
        return 2;
        }else {
        guerreiro.decremento();    
        return 1;
        }
    }

public int lutarRecursivo(Guerreiro guerreiro) {
    if (energia == 0) {
        decremento();        
        return 2;
    } else if (guerreiro.energia == 0) {
        guerreiro.decremento();    
        return 1;
    }else {
        int dano1 = atacar();    
        if (dano1 == 1) {
            guerreiro.decremento();
        }
            
        if (guerreiro.energia != 0) {
            int dano2 = guerreiro.atacar();
                
        if (dano2 == 1) {
            decremento();
        }
        }
            
        return lutarRecursivo(guerreiro);
        }
    }

public String toString() {
    return "Nome: " + nome + "\nCodigo: " + codigo + "\nEnergia: " + getEnergia();
}
}