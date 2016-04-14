# Quick-Bubble-Sort
快速排序、冒泡排序的实现-协同测试小项目
template<typename Type> void sort(Type *p,size_t size)
{
	Type temp;
	for(int i=0;i<size;i++)
	{
		for(int j=0;j<i;j++)
		{
		   if(p[i]>p[j])
		  {
			temp=p[i];
			p[i]=p[j];
			p[j]=temp;
		  }
		}
	}
}
