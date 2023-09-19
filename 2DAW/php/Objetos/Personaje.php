<?php
class Personaje{
    private $nombre;
    private $edad;
    static $CONT = 0;

   
    
    public function __toString()
    {
        return 'Nombre: '.$this->nombre.' Edad: '.$this->edad;
    }

	public function __construct($nombre, $edad) {

        self::$CONT++;
		$this->nombre = $nombre;
		$this->edad = $edad;
	}

	public function getNombre() {
		return $this->nombre;
	}

	public function setNombre($value) {
		$this->nombre = $value;
	}

	public function getEdad() {
		return $this->edad;
	}

	public function setEdad($value) {
		$this->edad = $value;
	}
}