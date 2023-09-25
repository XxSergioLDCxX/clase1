<?php
class Libro extends Ficha {
    private $autor;
    private $editorial;

    public function __construct($numeroIdentificacion, $titulo, $autor, $editorial) {
        parent::__construct($numeroIdentificacion, $titulo);
        $this->autor = $autor;
        $this->editorial = $editorial;
    }

    public function getAutor() {
        return $this->autor;
    }

    public function getEditorial() {
        return $this->editorial;
    }
}