# CasoPractico1
Programacion (Java)

private static void mostrarInformacionFacturas(Factura[] facturas) {
        StringBuilder facturaInfo = new StringBuilder();
        for (Factura factura : facturas) {
            facturaInfo.append("Monto de la factura: ").append(factura.getMontoFactura()).append("\n");
            facturaInfo.append("Estado de la factura: ").append(factura.isEstadoFactura() ? "Pagada" : "No pagada").append("\n\n");
        }
        JOptionPane.showMessageDialog(null, facturaInfo.toString());
    }

    private static void calcularDeudaTotalCliente(Factura[] facturas) {
        int cedulaClienteBuscar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cedula del cliente para calcular su deuda total:"));
        double totalDeuda = 0;
        for (Factura factura : facturas) {
            if (factura.cedulaCliente == cedulaClienteBuscar && !factura.isEstadoFactura()) {
                totalDeuda += factura.getMontoFactura();
            }
        }
        JOptionPane.showMessageDialog(null, "La deuda total del cliente con cedula " + cedulaClienteBuscar + " es: " + totalDeuda);
    }
}
