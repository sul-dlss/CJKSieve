/*
Copyright (c) 2012.
The Board of Trustees of the Leland Stanford Junior University.
All rights reserved.

Redistribution and use of this distribution in source and binary forms, with or
without modification, are permitted provided that: The above copyright notice
and this permission notice appear in all copies and supporting documentation;
The name, identifiers, and trademarks of The Board of Trustees of the Leland
Stanford Junior University are not used in advertising or publicity without the
express prior written permission of The Board of Trustees of the Leland Stanford
Junior University; Recipients acknowledge that this distribution is made
available as a research courtesy, "as is", potentially with defects, without
 any obligation on the part of The Board of Trustees of the Leland Stanford
 Junior University to provide support, services, or repair;

THE BOARD OF TRUSTEES OF THE LELAND STANFORD JUNIOR UNIVERSITY DISCLAIMS ALL
WARRANTIES, EXPRESS OR IMPLIED, WITH REGARD TO THIS SOFTWARE, INCLUDING WITHOUT
LIMITATION ALL IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A
PARTICULAR PURPOSE, AND IN NO EVENT SHALL THE BOARD OF TRUSTEES OF THE LELAND
STANFORD JUNIOR UNIVERSITY BE LIABLE FOR ANY SPECIAL, INDIRECT OR CONSEQUENTIAL
DAMAGES OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS,
WHETHER IN AN ACTION OF CONTRACT, TORT (INCLUDING NEGLIGENCE) OR STRICT
LIABILITY, ARISING OUT OF OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS
SOFTWARE.
*/

package edu.stanford.lucene.analysis.cjk;

/**
 * CJKSieve emit types
 * @author - Naomi Dushay
 */
public enum CJKEmitType
{
	/** emit only if Hangul script characters are present */
	HANGUL,
	/** emit only if Hiragana or Katakana script characters are present */
	JAPANESE,
	/** emit only if Han script characters are present and there are no Hangul, Hiragana or Katakana chars present */
	HAN_SOLO,
	/** emit only if Han, Hiragana, Katakana or Hangul script characters are present */
	ANY_CJK,
	/** emit only if no Han, Hiragana, Katakana or Hangul script characters are present */
	NO_CJK;
}
