<?php
class DVD extends Ficha {
    private $director;
    private $anio;
    private $tipo;

    public function __construct($numeroIdentificacion, $titulo, $director, $anio, $tipo) {
        parent::__construct($numeroIdentificacion, $titulo);
        $this->director = $director;
        $this->anio = $anio;
        $this->tipo = $tipo;
    }

    public function getDirector() {
        return $this->director;
    }

    public function getAnio() {
        return $this->anio;
    }

    public function getTipo() {
        return $this->tipo;
    }
}