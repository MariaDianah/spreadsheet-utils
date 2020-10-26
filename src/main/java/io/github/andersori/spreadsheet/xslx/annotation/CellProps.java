package io.github.andersori.spreadsheet.xslx.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CellProps {
  /** Nome do header presente na linha 0 do XLSX. Não é case sensitive. */
  String value();

  /** Posição da célula */
  int position();
}