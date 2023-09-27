<?php
class Mina {
    private $tipo;
    private $items;

    public function __construct($tipo = "ORO", $cantidad = 500) {
        $this->tipo = $tipo;
        $this->items = $cantidad;
    }

    public function getTipo() {
        return $this->tipo;
    }

    public function getItems() {
        return $this->items;
    }

    public function extraerItem(Aldeano $aldeano) {
        if ($this->items > 0) {
            $this->items--;
            $aldeano->getCivilizacion()->almacenarOro(1);
        }
    }
}