package org.provarules.reference2;

/*
 * Copyright (C) 1999-2005 <a href="mailto:mandarax@jbdietrich.com">Jens Dietrich</a>
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

/**
 * Simple class for counting the derivation step.
 *
 * @author <A HREF="mailto:mandarax@jbdietrich.com">Jens Dietrich</A>
 * @author <A HREF="mailto:a.kozlenkov@city.ac.uk">Alex Kozlenkov</A>
 * @version 2.0 <25 March 2007>
 * @since 1.8.1
 * Prova complete re-write
 */
final class ProvaDerivationStepCounter {
    int count = 0;

    /**
     * Increase the counter.
     *
     * @return the current count
     */
    int next() {
        count++;
        return count;
    }
}
