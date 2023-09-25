<?php
class Revista extends Ficha {
    private $numeroRevista;
    private $anioPublicacion;

    public function __construct($numeroIdentificacion, $titulo, $numeroRevista, $anioPublicacion) {
        parent::__construct($numeroIdentificacion, $titulo);
        $this->numeroRevista = $numeroRevista;
        $this->anioPublicacion = $anioPublicacion;
    }

    public function getNumeroRevista() {
        return $this->numeroRevista;
    }

    public function getAnioPublicacion() {
        return $this->anioPublicacion;
    }
}