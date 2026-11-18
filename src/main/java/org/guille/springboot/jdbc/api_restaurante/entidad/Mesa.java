package org.guille.springboot.jdbc.api_restaurante.entidad;

import jakarta.persistence.*;

@Entity // Le dice Hibernate que es una tabla de bbdd.
public class Mesa {

    @Id //Clave primaria autoincremental.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Unique para evitar que 2 mesas tengan el mismo número.
    //Nullable = false para que el campo sea obligatorio.
    @Column (nullable = false, unique = true)
    private Integer numero;

    @Column  (nullable = false)
    private Integer capacidad;

    @Column (nullable = false)
    private Boolean activa = true;

    //Constructor vacío para que Hibernate cree los objetos con él.
    public Mesa() {
    }

    //Sin setId porque lo asigna la bbdd.
    public Long getId() {
        return id;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public Boolean getActiva() {
        return activa;
    }

    public void setActiva(Boolean activa) {
        this.activa = activa;
    }
}



