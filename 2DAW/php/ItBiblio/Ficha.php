<?php
class Ficha {
    protected $numeroIdentificacion;
    protected $titulo;

    public function __construct($numeroIdentificacion, $titulo) {
        $this->numeroIdentificacion = $numeroIdentificacion;
        $this->titulo = $titulo;
    }

    public function getNumeroIdentificacion() {
        return $this->numeroIdentificacion;
    }

    public function getTitulo() {
        return $this->titulo;
    }
}