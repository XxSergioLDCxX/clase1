<?php
class Aldeano {
    private $nombre;
    private $salud;
    private $civilizacion;

    public function __construct($nombre, $salud, Civilizacion $civilizacion) {
        $this->nombre = $nombre;
        $this->salud = $salud;
        $this->civilizacion = $civilizacion;
    }

    public function getNombre() {
        return $this->nombre;
    }

    public function getSalud() {
        return $this->salud;
    }

    public function getCivilizacion() {
        return $this->civilizacion;
    }

    public function extraerItem(Mina $mina) {
        $mina->extraerItem($this);
    }
}