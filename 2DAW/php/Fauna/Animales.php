<?php

class Animal {
    protected $nombre;
    protected $raza;
    protected $peso;
    protected $color;

    public function __construct($nombre, $raza, $peso, $color) {
        $this->nombre = $nombre;
        $this->raza = $raza;
        $this->peso = $peso;
        $this->color = $color;
    }

    public function vacunar() {
        echo "{$this->nombre} ha sido vacunado.\n";
    }

    public function comer() {
        echo "{$this->nombre} está comiendo.\n";
    }

    public function dormir() {
        echo "{$this->nombre} está durmiendo.\n";
    }

    public function hacerRuido() {
        // Este método será sobreescrito en las subclases (Perro y Gato)
    }

    public function hacerCaso() {
        // Este método será sobreescrito en las subclases (Perro y Gato)
    }

	public function getNombre() {
		return $this->nombre;
	}

	public function setNombre($value) {
		$this->nombre = $value;
	}

	public function getRaza() {
		return $this->raza;
	}

	public function setRaza($value) {
		$this->raza = $value;
	}

	public function getPeso() {
		return $this->peso;
	}

	public function setPeso($value) {
		$this->peso = $value;
	}

	public function getColor() {
		return $this->color;
	}

	public function setColor($value) {
		$this->color = $value;
	}
}