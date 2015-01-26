package aktie.gui;

import org.eclipse.jface.viewers.ColumnLabelProvider;

public class CObjListLongColumnLabelProvider extends ColumnLabelProvider
{

    private String key;

    public CObjListLongColumnLabelProvider ( String k )
    {
        key = k;
    }

    @Override
    public String getText ( Object element )
    {
        CObjListGetter o = ( CObjListGetter ) element;
        return Long.toString ( o.getCObj().getNumber ( key ) );
    }

}
