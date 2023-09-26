<?php
class Animal {
    protected $nombre;
    protected $raza;
    protected $posicion;
    
    public function __construct($nombre, $raza) {
        $this->nombre = $nombre;
        $this->raza = $raza;
        $this->posicion = null;
    }

    public function getNombre() {
        return $this->nombre;
    }

    public function getRaza() {
        return $this->raza;
    }

    public function getPosicion() {
        return $this->posicion;
    }

    public function setPosicion($posicion) {
        $this->posicion = $posicion;
    }

    public function comer() {
        echo "{$this->nombre} está comiendo.\n";
    }

    public function dormir() {
        echo "{$this->nombre} está durmiendo.\n";
    }

    public function hacerRuido() {
        echo "{$this->nombre} hace algún ruido.\n";
    }
}