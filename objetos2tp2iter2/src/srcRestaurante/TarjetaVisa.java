package srcRestaurante;

public class TarjetaVisa implements TarjetaCredito {
	private float descuentoBebidas;

	public TarjetaVisa(int descuento) {
		descuentoBebidas = descuento;
	}

	@Override
	public Double calcularDescuento(Pedido pedido) {
		Double montoFinal = pedido.montoTotal();
		montoFinal = montoFinal - ((pedido.montoTotalBebidas() / 100) * this.descuentoBebidas);
		return montoFinal;
	}

}
