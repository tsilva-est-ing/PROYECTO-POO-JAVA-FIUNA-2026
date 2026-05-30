#Sistema de Gestión de Manufactura 
Estimar los costos de manufactura para impresión 3D o mecanizado CNC de forma manual consume bastante tiempo operativo en el taller. 
Para armar una cotización real hay que cruzar varios factores a la vez: 
el volumen del material a utilizar, la estimación del tiempo según las especificaciones técnicas de cada máquina (como el volumen máximo o las RPM del cabezal)
y llevar un control constante del inventario para asegurar que haya suficientes insumos antes de arrancar.
  El Problema
En los talleres de mecatrónica (o cualquier espacio maker/manufactura), llevar el control de los presupuestos de forma manual toma mucho tiempo y es súper propenso a errores matemáticos. 
Además, las cotizaciones suelen quedar anotadas en papeles que se pierden, por lo que nunca hay un registro decente de qué trabajos se hicieron.
  La Solución
Básicamente, armamos este sistema en Java para automatizar todo ese proceso molesto. La idea es simple: le dices al programa qué máquina vas a usar, qué material necesitas y la cantidad. 
El sistema hace la matemática pesada por ti.
  ¿Qué hace exactamente?
* **Cotizaciones al instante:** Calcula tiempos de fabricación y costos totales de forma automática, aplicando lógicas diferentes si es una Impresora 3D o una Cortadora CNC.
* **Control de inventario:** Descuenta los materiales (PLA o Aluminio) en tiempo real y te frena si intentas generar una orden sin stock suficiente.
* **Historial persistente:** Guarda un registro de todas las órdenes generadas en un archivo `.txt` local.
*  Así, aunque cierres el programa, tu historial de cotizaciones sigue ahí.

