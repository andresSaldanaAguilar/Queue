package cola;

import java.util.ArrayList;

public class Cola {

    NodoCola inicio,fin;    
    int tamanio;
    
    public Cola(){
        inicio=fin=null;
        tamanio=0;       
    }
    
    public boolean estaVacia(){
        return inicio==null;
    }
    
    public void insertar(int dato){
        NodoCola nuevo=new NodoCola(dato);
        if(estaVacia()){           
            inicio=nuevo;
        }
        else{           
            fin.siguiente=nuevo;
        }
        fin=nuevo;
        tamanio++;
    }
    
    public int quitar(){
        int aux=inicio.dato;
        inicio=inicio.siguiente;
        tamanio--;
        return aux;
    }
    
    public int inicioCola(){
        return inicio.dato;
    }
    
    public int tamanioCola(){
        return tamanio;
    }
    
    public ArrayList mostrarCola(){
        NodoCola aux=inicio;
        ArrayList al=new ArrayList();
        
        while(aux!=null){
            al.add(aux.dato);
            aux=aux.siguiente;
        }
        return al;
    }
    

}
