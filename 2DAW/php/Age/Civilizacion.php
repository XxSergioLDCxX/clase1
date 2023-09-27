<?php
class Civilizacion {
    private $nombre;
    private $almacen;

    public function __construct($nombre) {
        $this->nombre = $nombre;
        $this->almacen = 0;
    }

    public function getNombre() {
        return $this->nombre;
    }

    public function getAlmacen() {
        return $this->almacen;
    }

    public function almacenarOro($cantidad) {
        $this->almacen += $cantidad;
    }
}