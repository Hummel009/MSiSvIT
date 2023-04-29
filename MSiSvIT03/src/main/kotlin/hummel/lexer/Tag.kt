﻿package hummel.lexer

enum class Tag(val code: Int) {
	AND(1025),
	BASIC(1026),
	BREAK(1027),
	DO(1028),
	ELSE(1029),
	EQUAL(1030),
	FALSE(1031),
	GREAT_EQUAL(1032),
	ID(1033),
	IF(1034),
	INDEX(1035),
	LOWER_EQUAL(1036),
	MINUS(1037),
	NOT_EQUAL(1038),
	NUM(1039),
	OR(1040),
	FLOAT(1041),
	TEMP(1042),
	TRUE(1043),
	WHILE(1044),
	NOT(1045),
	BEGIN(1046),
	END(1047),
	OPERATOR_END(1048),
	LOOP(1050),
	UNTIL(1051),
	PUTS(1052),
	CASE(1053),
	WHEN(1054),
	GETS(1055)
}